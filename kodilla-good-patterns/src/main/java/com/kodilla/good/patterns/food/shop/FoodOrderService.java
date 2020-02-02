package com.kodilla.good.patterns.food.shop;

public class FoodOrderService {

    private InfoOrderService infoOrderService;
    private FoodOrderOperation foodOrderOperation;
    private FoodOrderRepository foodOrderRepository;

    public FoodOrderService(final InfoOrderService infoOrderService,
                            final FoodOrderOperation foodOrderOperation,
                            final FoodOrderRepository foodOrderRepository) {
        this.infoOrderService = infoOrderService;
        this.foodOrderOperation = foodOrderOperation;
        this.foodOrderRepository = foodOrderRepository;
    }

    public FoodOrderDTO processFoodOrderRequest(final FoodOrderRequest foodOrderRequest) {
        boolean isOrdered = foodOrderOperation.order(foodOrderRequest.getSupplier(), foodOrderRequest.getDate());
        if (isOrdered) {
            infoOrderService.inform(foodOrderRequest.getSupplier());
            foodOrderRepository.createOrder(foodOrderRequest.getSupplier(), foodOrderRequest.getSupplier().process(foodOrderRequest), foodOrderRequest.getDate());
            return new FoodOrderDTO(foodOrderRequest.getSupplier(), foodOrderRequest.getProduct(), foodOrderRequest.getQuantity(), foodOrderRequest.getDate(), true);
        } else {
            return new FoodOrderDTO(foodOrderRequest.getSupplier(), foodOrderRequest.getProduct(), foodOrderRequest.getQuantity(), foodOrderRequest.getDate(), false);
        }
    }
}
