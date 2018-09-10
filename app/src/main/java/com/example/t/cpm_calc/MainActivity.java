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
    private String[] typeOfTraffic = {"betting", "sport", "adult", "mainstream"};
    private String[] typeOfContact = {"Skype", "e-mail", "tel", "Telegram", "Messenger FB"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        initSpinner();
        initSpinner2();
        initSpinner3();
        initSpinner4();
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

    private void initSpinner() {

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
}
