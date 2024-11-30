package Place;

import java.util.Random;

public interface LocationInfo {

    // Метод для вычисления расстояния между текущим местоположением и другой точкой
    double calculateDistance(double lat, double lon);

    // Метод для получения текущей температуры в данном месте
    default int getCurrentTemperature() {
        // Генерация случайного значения температуры в диапазоне от -10 до 35 градусов Цельсия
        Random random = new Random();
        int temperature = (int) (-10 + (35 - (-10)) * random.nextDouble());

        return temperature;
    }

    // Метод для предоставления рекомендаций по одежде на основе текущей температуры
    default String getOutfitRecommendation() {
        double temperature = getCurrentTemperature();

        if (temperature < 0) {
            return "На улице очень холодно. Наденьте пуховик, шапку и теплые ботинки.";
        } else if (temperature < 10) {
            return "На улице холодно. Надевайте зимнюю куртку и шарф.";
        } else if (temperature < 20) {
            return "Температура приемлемая. Легкая весенняя одежда подойдет.";
        } else {
            return "На улице жарко. Одевайтесь легко.";
        }
    }

    // Дополнительный метод для вывода информации о текущей температуре и рекомендациях по одежде в консоль
    default void displayWeatherInfo() {
        double temperature = getCurrentTemperature();
        String outfitRecommendation = getOutfitRecommendation();

        System.out.println("Текущая температура: " + temperature + "°C");
        System.out.println("Рекомендации по одежде: " + outfitRecommendation);
    }


}