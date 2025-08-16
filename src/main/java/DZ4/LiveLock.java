package DZ4;

public class LiveLock {
    static class Friend {
        private String name;
        private boolean isHungry = true;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean isHungry() {
            return isHungry;
        }

        public void eatWith(Friend other) {
            while (isHungry) {
                if (other.isHungry()) {
                    System.out.println("Жду пока поест " + other.getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                } else {
                    System.out.println("Начинаю кушать");
                    isHungry = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Friend igor = new Friend("Игорь");
        Friend valera = new Friend("Валера");

        new Thread(() -> {
            igor.eatWith(valera);
        }).start();
        new Thread(() -> {
            valera.eatWith(igor);
        }).start();
    }

}
