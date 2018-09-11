package com.example.t.cpm_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView tvSpin;
    private Spinner spinnerTypeOfTraff;
    private Spinner spinnerContact1;
    private Spinner spinnerContact2;
    private Spinner spinnerContact3;

    private Spinner spinnerPos1;
    private Spinner spinnerPos2;
    private Spinner spinnerPos3;
    private Spinner spinnerPos4;
    private Spinner spinnerPos5;

    private Spinner spinnerCateg1;
    private Spinner spinnerCateg2;
    private Spinner spinnerCateg3;
    private Spinner spinnerCateg4;
    private Spinner spinnerCateg5;

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    private String[] typeOfTraffic = {"betting", "sport", "adlt", "mainstream"};
    private String[] typeOfContact = {"Skype", "e-mail", "tel", "Telegram", "Messenger FB"};
    private String[] typeOfPositions = {"кэтфиш", "баннер", "брендирование", "кликандер", "фуллскрин",
            "видео", "кэфы", "обзор", "статья"
            , "рейтинг", "озвучка", " спонсорство сайта", "ютуб", "соц сети", "поп-ап"};
    private String[] typeOfCategor = {"sport-betting", "adlt", "mainstream"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();

        initCPM1();
        initCPM2();
        initCPM3();
        initCPM4();
        initCPM5();
        String st1 = "баннер";
        String st2 = "mainstream";
        int numOfMet = choseMethod(st1, st2);
    }

    private int choseMethod(String st1, String st2) {
        double koefMin1 = 0.8;
        double koefMin2 = 0.5;
        double koefMin3 = 1.2;
        double koefMin4 = 0.2;
        double koefMin5 = 0.3;
        double koefMin6 = 0.5;
        double koefMin7 = 0.2;
        double koefMin8 = 0.3;
        double koefMin9 = 0.5;
        double koefMin10 = 0.2;
        double koefMin11 = 0.3;
        double koefMin12 = 0.5;
        double koefMin13 = 0.7;
        double koefMin14 = 0.4;
        double koefMin15 = 0.7;
        double koefMin16 = 0.9;
        double koefMin17 = 0.4;
        double koefMin18 = 0.7;
        double koefMin19 = 0.9;
        double koefMin20 = 0.4;
        double koefMin21 = 0.7;
        double koefMin22 = 0.9;

        double koefMax1 = 1.2;
        double koefMax2 = 1;
        double koefMax3 = 1.5;
        double koefMax4 = 0.5;
        double koefMax5 = 0.7;
        double koefMax6 = 0.9;
        double koefMax7 = 0.5;
        double koefMax8 = 0.7;
        double koefMax9 = 0.9;
        double koefMax10 = 0.5;
        double koefMax11 = 0.6;
        double koefMax12 = 0.9;
        double koefMax13 = 1.5;
        double koefMax14 = 0.8;
        double koefMax15 = 1;
        double koefMax16 = 1.2;
        double koefMax17 = 0.8;
        double koefMax18 = 1;
        double koefMax19 = 1.2;
        double koefMax20 = 0.8;
        double koefMax21 = 1;
        double koefMax22 = 1.2;


        if (st1 == "Кликандер" && st2 == "adult") {
            num1 = 1;
        }
        return 0;
    }

    private void initCPM5() {
        initSpinnerCpm5();
        initSpinnerCpmCategor5();
    }

    private void initCPM4() {
        initSpinnerCpm4();
        initSpinnerCpmCategor4();
    }

    private void initCPM3() {
        initSpinnerCpm3();
        initSpinnerCpmCategor3();
    }

    private void initCPM2() {
        initSpinnerCpm2();
        initSpinnerCpmCategor2();
    }

    private void initCPM1() {
        initSpinnerCpm1();
        initSpinnerCpmCategor1();
    }

    private void initSpinner1() {

        tvSpin = (TextView) findViewById(R.id.tvSpin);

        spinnerTypeOfTraff = (Spinner) findViewById(R.id.spinnerTypeOfTrafficMainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfTraffic);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerTypeOfTraff.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinnerTypeOfTraff.setOnItemSelectedListener(itemSelectedListener);


    }

    private void initSpinner2() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);

        spinnerContact1 = (Spinner) findViewById(R.id.spinnerTypeOfContact1MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfContact);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerContact1.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinnerContact1.setOnItemSelectedListener(itemSelectedListener);


    }

    private void initSpinner3() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerContact2 = (Spinner) findViewById(R.id.spinnerTypeOfContact2MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfContact);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerContact2.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerContact2.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinner4() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerContact3 = (Spinner) findViewById(R.id.spinnerTypeOfContact3MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfContact);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerContact3.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerContact3.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpm1() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerPos1 = (Spinner) findViewById(R.id.spinnerTypeOfPos1MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfPositions);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerPos1.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerPos1.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpm2() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerPos2 = (Spinner) findViewById(R.id.spinnerTypeOfPos2MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfPositions);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerPos2.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerPos2.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpm3() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerPos3 = (Spinner) findViewById(R.id.spinnerTypeOfPos3MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfPositions);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerPos3.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerPos3.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpm4() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerPos4 = (Spinner) findViewById(R.id.spinnerTypeOfPos4MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfPositions);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerPos4.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerPos4.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpm5() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerPos5 = (Spinner) findViewById(R.id.spinnerTypeOfPos5MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfPositions);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerPos5.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerPos5.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpmCategor1() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerCateg1 = (Spinner) findViewById(R.id.spinnerTypeOfCat1MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfCategor);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerCateg1.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerCateg1.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpmCategor2() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerCateg2 = (Spinner) findViewById(R.id.spinnerTypeOfCat2MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfCategor);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerCateg2.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerCateg2.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpmCategor3() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerCateg3 = (Spinner) findViewById(R.id.spinnerTypeOfCat3MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfCategor);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerCateg3.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerCateg3.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpmCategor4() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerCateg4 = (Spinner) findViewById(R.id.spinnerTypeOfCat4MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfCategor);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerCateg4.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerCateg4.setOnItemSelectedListener(itemSelectedListener);
    }

    private void initSpinnerCpmCategor5() {
        // tvSpin = (TextView) findViewById(R.id.tvSpin);
        spinnerCateg5 = (Spinner) findViewById(R.id.spinnerTypeOfCat5MainActivity);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeOfCategor);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinnerCateg5.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                //tvSpin.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinnerCateg5.setOnItemSelectedListener(itemSelectedListener);
    }


}
