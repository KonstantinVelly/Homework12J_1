import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product item1 = new Product(1, "book1", 25);
    Product item2 = new Product(2, "smartphone1", 150);

    Product item3 = new Product(3, "book2", 50);

  //  @Test
    //public void findItemByName() {
      //  Product[] items = { item1, item2, item3 };
        //manager.matches().when(repo).getItems();
        //repo.save(item1);
        //repo.save(item2);
        //repo.save(item3);

        //Product[] expected = {item1};
        //Product[] actual = manager.searchBy("book1");

        //Assertions.assertArrayEquals(expected, actual);
    //}
}