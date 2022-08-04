import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "CryI", 25, "Ivanov" );
    Product smartphone1 = new Smartphone(22, "smartphone1", 1500, "Samsung");
    Product book2 = new Book(3, "CryII", 50, "Vodolazkin");
    Product book3 = new Book(4, "Shining", 120, "Pushkin");

   @Test
  public void findItemByName() {
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        //Ищем несколько продуктов
        Product[] expected = {book1, book2};
        Product[] actual = manager.searchBy("Cry");

        Assertions.assertArrayEquals(expected, actual);

       //Ищем один продукт
       Product[] expected1 = {smartphone1};
       Product[] actual1 = manager.searchBy("smartphone1");

       Assertions.assertArrayEquals(expected1, actual1);

       //Продукта в списке нет
       Product[] expected2 = {};
       Product[] actual2 = manager.searchBy("Harry Potter");

       Assertions.assertArrayEquals(expected2, actual2);

      }
}