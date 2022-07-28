import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product item1 = new Product(1, "book1", 25, "author1");
    Product item2 = new Product(2, "smartphone1", 150, "producer1");

    Product item3 = new Product(3, "book2", 50, "author2");

    @Test
    public void findItemById() {
        Product[] items = { item1, item2, item3 };
        //matches(items).when(repo).getItems();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Product[] expected = {item1};
        Product[] actual = manager.searchBy(1);

        Assertions.assertEquals(expected, actual);
    }

}