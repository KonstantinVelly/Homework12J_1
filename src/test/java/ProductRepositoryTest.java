
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product book1 = new Book(1, "CryI", 25, "Ivanov" );
    Product smartphone1 = new Smartphone(22, "smartphone1", 1500, "Samsung");
    Product book2 = new Book(3, "CryII", 50, "Vodolazkin");
    Product book3 = new Book(4, "Shining", 120, "Pushkin");

    @Test //Добавление элемента
    public void AddItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        //repo.removeById(book2.getId());
        Product smartphone2 = new Smartphone(555, "smartphone2", 2000, "Apple");
        repo.save(smartphone2);

        Product[] expected = {book1, book2, book3, smartphone1, smartphone2};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test //Показать все элементы
    public void ShowAllItems() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        //repo.save(book2.getId());

        Product[] expected = {book1, book2, book3, smartphone1};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test //Удаление элемента
    public void DeleteItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);

        repo.removeById(book2.getId());

        Product[] expected = {book1, book3, smartphone1};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}