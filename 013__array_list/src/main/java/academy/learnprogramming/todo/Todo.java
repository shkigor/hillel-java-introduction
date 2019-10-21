package academy.learnprogramming.todo;

import java.util.ArrayList;

public class Todo {
    private Catalog defaultCatalog;
    private ArrayList<Catalog> catalogList;
    private final String defaultCatalogName;

    public Todo(String owner) {
        defaultCatalogName = "DEFAULT CATALOG FOR PERSON " + owner;
        defaultCatalog = new Catalog(defaultCatalogName);
        catalogList = new ArrayList<>();
    }

    public boolean addCatalog(String name) {
        Catalog catalog = findCatalog(name);
        if (catalog == null) {
            catalogList.add(new Catalog(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addTask(String catalogName, String taskName) {
        Catalog catalog = findCatalog(catalogName);
        if (catalog != null) {
            return catalog.addTask(taskName);
        } else {
            System.out.println("- Каталог \"" + catalogName + "\" не найден.");
            return false;
        }
    }

    public boolean addTaskToDefaultCatalog(String taskName) {
        return defaultCatalog.addTask(taskName);
    }

    public void printTasks(String catalogName) {
        Catalog catalog = findCatalog(catalogName);
        if (catalog != null) {
            catalog.printTasks();
        } else {
            System.out.println("printTasks: Каталог \"" + catalogName + "\" не найден.");
        }

    }

    public void printTasks() {
        defaultCatalog.printTasks();

        for (Catalog catalog : catalogList) {
            catalog.printTasks();
        }
    }

    private Catalog findCatalog(String name) {
        for (int i = 0; i < catalogList.size(); i++) {
            Catalog catalog = catalogList.get(i);
            if (name.equalsIgnoreCase(catalog.getName())) {
                return catalog;
            }
        }
        return null;
    }
}
