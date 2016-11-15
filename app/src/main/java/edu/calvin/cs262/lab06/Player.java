package edu.calvin.cs262.lab06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Player forecast object (POJO), one per day, based on openweathermap's RESTful API.
 * Based on Deitel's WeatherViewer app (chapter 17).
 *
 * @author deitel
 * @author kvlinden
 * @version spring, 2017
 *
 * What does the application do for invalid cities?
 *  For invalid cities, the application toasts the connection_error string:
 *      "Failed to connect to service..."
 *
 * What is the API key? What does it do?
 *  The API key is the string openweather_api_key (8301442678d36413b4e3a04d016deee7)
 *  It accesses the open Application Programming Interface provided by openweather.
 *
 * What does the full JSON response look like?
 *
 *
 *
 * What does the system do with the JSON data?
 * What is the Player class designed to do?
 *
 *
 */
public class Player {

    private int id;
    private String email;
    private String name;

    public Player(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getName() { return name; }


}
