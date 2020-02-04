import com.kodilla.good.patterns.food.shop.*;

public class PatternsMain {
    public static void main(String[] args) {
        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetriever.retrieve();

        FoodOrderService foodOrderService = new FoodOrderService(new InfoOrderFoodService(), new ServiceOfFoodOrders(), new RepositoryOfFoodOrders());

        foodOrderService.processFoodOrderRequest(foodOrderRequest);

    }
}
