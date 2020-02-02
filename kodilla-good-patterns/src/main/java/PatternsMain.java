import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.food.shop.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatternsMain {
    public static void main(String[] args) {
        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetriever.retrieve();

        FoodOrderService foodOrderService = new FoodOrderService(new InfoOrderFoodService(), new ServiceOfFoodOrders(), new RepositoryOfFoodOrders());

        foodOrderService.processFoodOrderRequest(foodOrderRequest);

    }
}
