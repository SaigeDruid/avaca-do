package com.example.avaca_doonline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class Settings extends AppCompatActivity
{
    MainActivity main = new MainActivity();
    UserInfo user = new UserInfo();

    private EditText Name;
    private EditText Email;
    private EditText Username;
    private EditText Password;
    private Button SaveSettings;
    private Button SaveInterests;
    private CheckBox Sports;
    private CheckBox Walking;
    private CheckBox Exercise;
    private CheckBox Running;
    private CheckBox Tennis;
    private CheckBox Bicycling;
    private CheckBox Swimming;
    private CheckBox Skiing;
    private CheckBox Golf;
    private CheckBox Football;
    private CheckBox Baseball;
    private CheckBox Basketball;
    private CheckBox IceSkating;
    private CheckBox Hockey;
    private CheckBox PingPong;
    private CheckBox Music;
    private CheckBox Band;
    private CheckBox Singing;
    private CheckBox HeavyMetal;
    private CheckBox HardRock;
    private CheckBox Jazz;
    private CheckBox Classical;
    private CheckBox PopRock;
    private CheckBox RB;
    private CheckBox Traveling;
    private CheckBox Fishing;
    private CheckBox Hunting;
    private CheckBox Socializing;
    private CheckBox CommunityWork;
    private CheckBox Church;
    private CheckBox Volunteer;
    private CheckBox Pagan;
    private CheckBox Tea;
    private CheckBox Coffee;
    private CheckBox Art;
    private CheckBox Computer;


    public static final String SHARED_PREFS = "shared prefs";
    public static final String SAVE_SETTINGS = "save settings";
    public static final String SAVE_INTERESTS = "save interests";
    public static final String NAME = "name";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String SPORTS = "sports";
    public static final String WALKING = "walking";
    public static final String EXERCISE = "exercise";
    public static final String RUNNING = "running";
    public static final String TENNIS = "tennis";
    public static final String BICYCLING = "bicycling";
    public static final String SWIMMING = "swimming";
    public static final String SKIING = "skiing";
    public static final String GOLF = "golf";
    public static final String FOOTBALL = "football";
    public static final String BASEBALL = "baseball";
    public static final String BASKETBALL = "basketball";
    public static final String ICE_SKATING = "ice skating";
    public static final String HOCKEY = "hockey";
    public static final String PING_PONG = "ping pong";
    public static final String MUSIC = "music";
    public static final String BAND = "band";
    public static final String SINGING = "singing";
    public static final String HEAVY_METAL = "heavy metal";
    public static final String HARD_ROCK =  "hard rock";
    public static final String JAZZ = "jazz";
    public static final String CLASSICAL = "classical";
    public static final String POP_ROCK = "pop rock";
    public static final String R_B = "rhythm blues";
    public static final String TRAVELING = "traveling";
    public static final String FISHING = "fishing";
    public static final String HUNTING = "hunting";
    public static final String SOCIALIZING = "socializing";
    public static final String COMMUNITY_WORK = "community work";
    public static final String CHURCH = "church";
    public static final String VOLUNTEER = "volunteer";
    public static final String PAGAN = "pagan";
    public static final String TEA = "tea";
    public static final String COFFEE = "coffee";
    public static final String ART = "art";
    public static final String COMPUTER = "computer";

    private String name;
    private String email = main.getEmail();
    private String username = user.getUserName();
    private String password = main.getPassword();
    private boolean checkSports;
    private boolean checkWalking;
    private boolean checkExercise;
    private boolean checkRunning;
    private boolean checkTennis;
    private boolean checkBicycling;
    private boolean checkSwimming;
    private boolean checkSkiing;
    private boolean checkGolf;
    private boolean checkFootball;
    private boolean checkBaseball;
    private boolean checkBasketball;
    private boolean checkIceSkating;
    private boolean checkHockey;
    private boolean checkPingPong;
    private boolean checkMusic;
    private boolean checkBand;
    private boolean checkSinging;
    private boolean checkHeavyMetal;
    private boolean checkHardRock;
    private boolean checkJazz;
    private boolean checkClassical;
    private boolean checkPopRock;
    private boolean checkRB;
    private boolean checkTraveling;
    private boolean checkFishing;
    private boolean checkHunting;
    private boolean checkSocializing;
    private boolean checkCommunityWork;
    private boolean checkChurch;
    private boolean checkVolunteer;
    private boolean checkPagan;
    private boolean checkTea;
    private boolean checkCoffee;
    private boolean checkArt;
    private boolean checkComputer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Name = findViewById(R.id.etName);
        Email = findViewById(R.id.etEmail);
        Username = findViewById(R.id.etUsername);
        Password = findViewById(R.id.etPassword);
        SaveSettings = findViewById(R.id.btnSaveSettings);
        SaveInterests = findViewById(R.id.btnSaveInterests);
        Sports = findViewById(R.id.cbSports);
        Walking = findViewById(R.id.cbWalking);
        Exercise = findViewById(R.id.cbExercise);
        Running = findViewById(R.id.cbRunning);
        Tennis = findViewById(R.id.cbTennis);
        Bicycling = findViewById(R.id.cbBicycling);
        Swimming = findViewById(R.id.cbSwimming);
        Skiing = findViewById(R.id.cbSkiing);
        Golf = findViewById(R.id.cbGolf);
        Football = findViewById(R.id.cbFootball);
        Baseball = findViewById(R.id.cbBaseball);
        Basketball = findViewById(R.id.cbBasketball);
        IceSkating = findViewById(R.id.cbIceSkating);
        Hockey = findViewById(R.id.cbHockey);
        PingPong = findViewById(R.id.cbPingPong);
        Music = findViewById(R.id.cbMusic);
        Band = findViewById(R.id.cbBand);
        Singing = findViewById(R.id.cbSinging);
        HeavyMetal = findViewById(R.id.cbHeavyMetal);
        HardRock = findViewById(R.id.cbHardRock);
        Jazz = findViewById(R.id.cbJazz);
        Classical = findViewById(R.id.cbClassical);
        PopRock = findViewById(R.id.cbPopRock);
        RB = findViewById(R.id.cbRB);
        Traveling = findViewById(R.id.cbTraveling);
        Fishing = findViewById(R.id.cbFishing);
        Hunting = findViewById(R.id.cbHunting);
        Socializing = findViewById(R.id.cbSocializing);
        CommunityWork = findViewById(R.id.cbCommunityWork);
        Church = findViewById(R.id.cbChurch);
        Volunteer = findViewById(R.id.cbVolunteer);
        Pagan = findViewById(R.id.cbPagan);
        Tea = findViewById(R.id.cbTea);
        Coffee = findViewById(R.id.cbCoffee);
        Art = findViewById(R.id.cbArt);
        Computer = findViewById(R.id.cbComputer);

        SaveSettings.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                saveSettings();
            }
        });

        SaveInterests.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                saveInterests();
            }
        });

        loadSettings();
        updateViews();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent = new Intent(Settings.this, UserInfo.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                Intent intent2 = new Intent(Settings.this, MainActivity.class);
                startActivity(intent2);
                return true;
            case R.id.item3:
                Intent intent3 = new Intent(Settings.this, Settings.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                Intent intent4 = new Intent(Settings.this, SearchInterests.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void saveSettings()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(NAME, Name.getText().toString());
        editor.putString(EMAIL, Email.getText().toString());
        editor.putString(USERNAME, Username.getText().toString());
        editor.putString(PASSWORD, Password.getText().toString());

        editor.apply();

        Toast.makeText(this, "Settings Saved", Toast.LENGTH_SHORT).show();
    }

    public void saveInterests()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(SPORTS, Sports.isChecked());
        editor.putBoolean(WALKING, Walking.isChecked());
        editor.putBoolean(EXERCISE, Exercise.isChecked());
        editor.putBoolean(RUNNING, Running.isChecked());
        editor.putBoolean(TENNIS, Tennis.isChecked());
        editor.putBoolean(BICYCLING, Bicycling.isChecked());
        editor.putBoolean(SWIMMING, Swimming.isChecked());
        editor.putBoolean(SKIING, Skiing.isChecked());
        editor.putBoolean(GOLF, Golf.isChecked());
        editor.putBoolean(FOOTBALL, Football.isChecked());
        editor.putBoolean(BASEBALL, Baseball.isChecked());
        editor.putBoolean(BASKETBALL, Basketball.isChecked());
        editor.putBoolean(ICE_SKATING, IceSkating.isChecked());
        editor.putBoolean(HOCKEY, Hockey.isChecked());
        editor.putBoolean(PING_PONG, PingPong.isChecked());
        editor.putBoolean(MUSIC, Music.isChecked());
        editor.putBoolean(BAND, Band.isChecked());
        editor.putBoolean(SINGING, Singing.isChecked());
        editor.putBoolean(HEAVY_METAL, HeavyMetal.isChecked());
        editor.putBoolean(HARD_ROCK, HardRock.isChecked());
        editor.putBoolean(JAZZ, Jazz.isChecked());
        editor.putBoolean(CLASSICAL, Classical.isChecked());
        editor.putBoolean(POP_ROCK, PopRock.isChecked());
        editor.putBoolean(R_B, RB.isChecked());
        editor.putBoolean(TRAVELING, Traveling.isChecked());
        editor.putBoolean(FISHING, Fishing.isChecked());
        editor.putBoolean(HUNTING, Hunting.isChecked());
        editor.putBoolean(SOCIALIZING, Socializing.isChecked());
        editor.putBoolean(COMMUNITY_WORK, CommunityWork.isChecked());
        editor.putBoolean(CHURCH, Church.isChecked());
        editor.putBoolean(VOLUNTEER, Volunteer.isChecked());
        editor.putBoolean(PAGAN, Pagan.isChecked());
        editor.putBoolean(TEA, Tea.isChecked());
        editor.putBoolean(COFFEE, Coffee.isChecked());
        editor.putBoolean(ART, Art.isChecked());
        editor.putBoolean(COMPUTER, Computer.isChecked());

        editor.apply();

        Toast.makeText(this, "Interests Saved", Toast.LENGTH_SHORT).show();
    }
    public void loadSettings()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        name  = sharedPreferences.getString(NAME, "");
        email = sharedPreferences.getString(EMAIL, "");
        username = sharedPreferences.getString(USERNAME, "");
        password = sharedPreferences.getString(PASSWORD, "");
        checkSports = sharedPreferences.getBoolean(SPORTS, false);
        checkWalking = sharedPreferences.getBoolean(WALKING, false);
        checkExercise = sharedPreferences.getBoolean(EXERCISE, false);
        checkRunning = sharedPreferences.getBoolean(RUNNING, false);
        checkTennis = sharedPreferences.getBoolean(TENNIS, false);
        checkBicycling = sharedPreferences.getBoolean(BICYCLING, false);
        checkSwimming = sharedPreferences.getBoolean(SWIMMING, false);
        checkSkiing = sharedPreferences.getBoolean(SKIING, false);
        checkGolf = sharedPreferences.getBoolean(GOLF, false);
        checkFootball = sharedPreferences.getBoolean(FOOTBALL, false);
        checkBaseball = sharedPreferences.getBoolean(BASEBALL, false);
        checkBasketball = sharedPreferences.getBoolean(BASKETBALL, false);
        checkIceSkating = sharedPreferences.getBoolean(ICE_SKATING, false);
        checkHockey = sharedPreferences.getBoolean(HOCKEY, false);
        checkPingPong = sharedPreferences.getBoolean(PING_PONG, false);
        checkMusic = sharedPreferences.getBoolean(MUSIC, false);
        checkBand = sharedPreferences.getBoolean(BAND, false);
        checkSinging = sharedPreferences.getBoolean(SINGING, false);
        checkHeavyMetal = sharedPreferences.getBoolean(HEAVY_METAL, false);
        checkHardRock = sharedPreferences.getBoolean(HARD_ROCK, false);
        checkJazz = sharedPreferences.getBoolean(JAZZ, false);
        checkClassical = sharedPreferences.getBoolean(CLASSICAL, false);
        checkPopRock = sharedPreferences.getBoolean(POP_ROCK, false);
        checkRB = sharedPreferences.getBoolean(R_B, false);
        checkTraveling = sharedPreferences.getBoolean(TRAVELING, false);
        checkFishing = sharedPreferences.getBoolean(FISHING, false);
        checkHunting = sharedPreferences.getBoolean(HUNTING, false);
        checkSocializing = sharedPreferences.getBoolean(SOCIALIZING, false);
        checkCommunityWork = sharedPreferences.getBoolean(COMMUNITY_WORK, false);
        checkChurch = sharedPreferences.getBoolean(CHURCH, false);
        checkVolunteer = sharedPreferences.getBoolean(VOLUNTEER, false);
        checkPagan = sharedPreferences.getBoolean(PAGAN, false);
        checkTea = sharedPreferences.getBoolean(TEA, false);
        checkCoffee = sharedPreferences.getBoolean(COFFEE, false);
        checkArt = sharedPreferences.getBoolean(ART, false);
        checkComputer = sharedPreferences.getBoolean(COMPUTER, false);
    }

    public void updateViews()
    {
        Name.setText(name);
        Email.setText(email);
        Username.setText(username);
        Password.setText(password);
        Sports.setChecked(checkSports);
        Walking.setChecked(checkWalking);
        Exercise.setChecked(checkExercise);
        Running.setChecked(checkRunning);
        Tennis.setChecked(checkTennis);
        Bicycling.setChecked(checkBicycling);
        Swimming.setChecked(checkSwimming);
        Skiing.setChecked(checkSkiing);
        Golf.setChecked(checkGolf);
        Football.setChecked(checkFootball);
        Baseball.setChecked(checkBaseball);
        Basketball.setChecked(checkBasketball);
        IceSkating.setChecked(checkIceSkating);
        Hockey.setChecked(checkHockey);
        PingPong.setChecked(checkPingPong);
        Music.setChecked(checkMusic);
        Band.setChecked(checkBand);
        Singing.setChecked(checkSinging);
        HeavyMetal.setChecked(checkHeavyMetal);
        HardRock.setChecked(checkHardRock);
        Jazz.setChecked(checkJazz);
        Classical.setChecked(checkClassical);
        PopRock.setChecked(checkPopRock);
        RB.setChecked(checkRB);
        Traveling.setChecked(checkTraveling);
        Fishing.setChecked(checkFishing);
        Hunting.setChecked(checkHunting);
        Socializing.setChecked(checkSocializing);
        CommunityWork.setChecked(checkCommunityWork);
        Church.setChecked(checkChurch);
        Volunteer.setChecked(checkVolunteer);
        Pagan.setChecked(checkPagan);
        Tea.setChecked(checkTea);
        Coffee.setChecked(checkCoffee);
        Art.setChecked(checkArt);
        Computer.setChecked(checkComputer);



    }
}
