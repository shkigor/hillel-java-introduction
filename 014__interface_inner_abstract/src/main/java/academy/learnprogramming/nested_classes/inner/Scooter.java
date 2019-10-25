package academy.learnprogramming.nested_classes.inner;

public class Scooter {

    private String model;
    private int height;
    private int weight;

    public Scooter(String model, int height, int weight) {
        this.model = model;
        this.height = height;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    class Wheel {
        private int type;

        public Wheel(int type) {
            this.type = type;
        }

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево");
        }

        public void up(int length) {
            height += length;
            System.out.println("Руль поднят выше на " + length + "см ! Теперь его высота = " + height);
        }

        public void down(int length) {
            height -= length;
            System.out.println("Руль опущен ниже на " + length + "см ! Теперь его высота = " + Scooter.this.height);
        }
    }
}
