package restaurant.repositories;

import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.repositories.interfaces.HealthFoodRepository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class HealthFoodRepositoryImpl implements HealthFoodRepository<HealthyFood> {

    private Map<String, HealthyFood> food;

    public HealthFoodRepositoryImpl() {
        this.food = new LinkedHashMap<>();
    }

    @Override
    public HealthyFood foodByName(String name) {
        return food.get(name);
    }

    @Override
    public Collection<HealthyFood> getAllEntities() {
        return food.values();
    }

    @Override
    public void add(HealthyFood entity) {
        food.put(entity.getName(), entity);
    }
}
