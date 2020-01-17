package academy.learnprogramming.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "����� ������ ���";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("�������");
    }

    public String plot() {
        return "����� ��� ����� �����";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("���� �������������");
    }

    @Override
    public String plot() {
        return "������������ �������� ��������� ������� �����";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("������� � ���������");
    }

    @Override
    public String plot() {
        return "���� �������� �������� ���������";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("�������� �����");
    }

    @Override
    public String plot() {
        return "��������� ���� �������� ��������� ���������";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("����������");
    }

    // No plot method
}


public class MainPolymorphism {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
