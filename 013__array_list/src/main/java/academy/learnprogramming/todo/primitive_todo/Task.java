package academy.learnprogramming.todo.primitive_todo;

public class Task {
    private String comment;
    private String category;

    public Task(String comment, String category) {
        this.comment = comment;
        this.category = category;
    }

    public String getComment() {
        return comment;
    }

    public String getCategory() {
        return category;
    }
}
