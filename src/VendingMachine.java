package Seminar_7_OOP.src;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

//    void initProducts (List<Product> productList); // метод инициализурует наш список с продуктами
//    // (в нашем случае выполняет роль конструктора)

    Product getProduct(String name);

    Product getProduct(String name, double volume);
}
