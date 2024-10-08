package org.example.syncfusion.controller;
import org.example.syncfusion.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DataController
{

    private List<Order> orders = List.of(
            new Order(10248, "VINET", 32.38, "USA"),
            new Order(10249, "TOMSP", 11.61, "Germany"),
            new Order(10250, "HANAR", 65.83, "Brazil"),
            new Order(10251, "VICTE", 41.34, "USA")
    );

    @GetMapping("/orders")
    public List<Order> getOrders(@RequestParam(required = false) String search)
    {
        if (search == null || search.isEmpty())
        {
            return orders;
        }

        return orders.stream()
                .filter(order -> order.getCustomerName().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList());
    }
}
