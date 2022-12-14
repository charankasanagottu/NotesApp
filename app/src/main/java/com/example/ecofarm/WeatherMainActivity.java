package com.example.ecofarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.ecofarm.databinding.ActivityWeatherMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;

public class WeatherMainActivity extends AppCompatActivity {

    EditText etCity, etCountry;
    TextView tvResult;
    ImageButton backBtn;
    private ActivityWeatherMainBinding binding;

    private final String url = "https://api.openweathermap.org/data/2.5/weather";
    private final String appid = "a6fc9b965a006e8c5a38bffd277f014d";
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWeatherMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        etCity = findViewById(R.id.etCity);
        etCountry = findViewById(R.id.etCountry);
        tvResult  = findViewById(R.id.tvResult);

    }

    public void getWeatherDetails(View view) {
        String tempUrl = "";
        String city = binding.etCity.getText().toString().trim();
        String country = binding.etCountry.getText().toString().trim();
        if(city.equals("")){
            binding.tvResult.setText("City field can not be empty!");
        }else{
            if(!country.equals("")){
                tempUrl = url + "?q=" + city + "," + country + "&appid=" + appid;
            }else{
                tempUrl = url + "?q=" + city + "&appid=" + appid;
            }
            StringRequest stringRequest = new StringRequest(Request.Method.POST, tempUrl, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    String output = "";
                    try {
                        JSONObject jsonResponse = new JSONObject(response);
                        JSONArray jsonArray = jsonResponse.getJSONArray("weather");
                        JSONObject jsonObjectWeather = jsonArray.getJSONObject(0);
                        String description = jsonObjectWeather.getString("description");
                        JSONObject jsonObjectMain = jsonResponse.getJSONObject("main");
                        double temp = jsonObjectMain.getDouble("temp") - 273.15;
                        double feelsLike = jsonObjectMain.getDouble("feels_like") - 273.15;
                        float pressure = jsonObjectMain.getInt("pressure");
                        int humidity = jsonObjectMain.getInt("humidity");
                        JSONObject jsonObjectWind = jsonResponse.getJSONObject("wind");
                        String wind = jsonObjectWind.getString("speed");
                        JSONObject jsonObjectClouds = jsonResponse.getJSONObject("clouds");
                        String clouds = jsonObjectClouds.getString("all");
                        JSONObject jsonObjectSys = jsonResponse.getJSONObject("sys");
                        String countryName = jsonObjectSys.getString("country");
                        String cityName = jsonResponse.getString("name");
                        output += "Current weather of " + cityName + " (" + countryName + ")"
                                + "\n Temp: " + df.format(temp) + " ??C"+"\n"
                                + "\n Feels Like: " + df.format(feelsLike) + " ??C"+"\n"
                                + "\n Humidity: " + humidity + "%"+"\n"
                                + "\n Description: " + description+"\n"
                                + "\n Wind Speed: " + wind + "m/s (meters per second)"+"\n"
                                + "\n Cloudiness: " + clouds + "%"+"\n"
                                + "\n Pressure: " + pressure + " hPa";
                        binding.tvResult.setText(output);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener(){

                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show();
                }
            });
            RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
            requestQueue.add(stringRequest);
        }
    }
}
