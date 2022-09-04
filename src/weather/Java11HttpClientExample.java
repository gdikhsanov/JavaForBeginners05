package weather;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.*;//НАДО ОБЯЗАТЕЛЬНО ДОБАВИТЬ json-20220320.jar(или любую версию org.json) КАК ВНЕШНЮЮ БИБЛИОТЕКУ
    public class Java11HttpClientExample {
        // one instance, reuse
        private final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        public static void main(String[] args) throws Exception {

            Java11HttpClientExample obj = new Java11HttpClientExample();
           // System.out.println("Testing 1 - Send Http GET request");
            obj.sendGet();
        }
       //-----------------отправка первого запроса-------------------------------------------------
        private void sendGet() throws Exception {
            String city = "Sochi";//Задаём город
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://api.openweathermap.org/data/2.5/" +//get запрос прогноза на сегодня
                            "weather?q=" + (city) +
                            "&appid=2dbf2486d29bc3da1362709849e305e5" + //api ключ
                            "&units=metric&lang=ru"))//метрическая система и русский язык

                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // МОЖНО ДЛЯ ИНТЕРЕСА НАПЕЧАТАТЬ BODY Т.Е. ОРИГИНАЛЬНЫЙ JSON, НО В ТАКОМ ВИДЕ ЕГО НЕ ПРИМЕТ JSONObject,
            // ИЗ-ЗА ДВОЙНЫХ КАВЫЧЕК

            // print response body
            //System.out.println(response.body());

        //----------------------------разбор первого ответа-----------------------------------------------------

            JSONObject obj = new JSONObject(response.body());//создаём json объект из body ответа  response.body()
            int temp = obj.getJSONObject("main").getInt("temp");//из объекта main берём значение ключа temp
            Double wind = obj.getJSONObject("wind").getDouble("speed");//из объекта wind берём значение ключа speed
            JSONArray arr = obj.getJSONArray("weather");//из массива weather берем значение ключа description
                        for (int i = 0; i < arr.length(); i++) {
                String description = arr.getJSONObject(i).getString("description");

            System.out.println("Погода в городе "
                    + obj.getString("name") // берём просто значение ключа name из корня json
                    +" сегодня: " + temp + (char)186 + "С, "
                    + description + ", скорость ветра " + wind + " м/с");
            }
            //-----------------отправка второго запроса-------------------------------------------------

            city = "Moscow";
            request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://api.openweathermap.org/data/2.5/" +
                            "weather?q=" +
                            (city) +
                            "&appid=2dbf2486d29bc3da1362709849e305e5&units=metric&lang=ru"))
                    //setHeader("User-Agent", "Java 11 HttpClient Bot")
                    .build();

            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            //----------------------------разбор второго ответа-----------------------------------------------------
            // всё аналогично, но уже не объявляем, объявленные ранее переменные(obj, temp, wind, arr)
            obj = new JSONObject(
                    response.body());
            temp = obj.getJSONObject("main").getInt("temp");
            wind = obj.getJSONObject("wind").getDouble("speed");
            arr = obj.getJSONArray("weather");
            for (int i = 0; i < arr.length(); i++) {
                String description = arr.getJSONObject(i).getString("description");

                System.out.println("Погода в городе " + obj.getString("name") +" сегодня: " + temp + (char)186 + "С, "
                        + description + ", скорость ветра " + wind + " м/с");
            }



        }


        //----------------------понятия не имею, что это, но без этого json-парсер не работает :))))-------------------------
//        private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
//            var builder = new StringBuilder();
//            for (Map.Entry<Object, Object> entry : data.entrySet()) {
//                if (builder.length() > 0) {
//                    builder.append("&");
//                }
//                builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
//                builder.append("=");
//                builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
//            }
//            System.out.println(builder.toString());
//            return HttpRequest.BodyPublishers.ofString(builder.toString());
//        }

    }

