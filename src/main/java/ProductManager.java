import java.util.Scanner;

public class ProductManager {
    protected int id;
     protected String name;
     protected int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    private ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void add(Product item) {
        repo.save(item); // добавляем элемент
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: ProductRepository.getItems()) {
            if (matches(product, text)) {
                 // "добавляем в конец" массива result продукт product
                repo.save(product);
                }
            }
            return result;
        }

        // метод определения соответствия товара product запросу search
        public boolean matches(Product product, String search) {
            if (product.getName().contains(search)) {
                return true;
            } else {
                return false;
            }
            // или в одну строку:
            // return product.getName().contains(search);
        }
    }

