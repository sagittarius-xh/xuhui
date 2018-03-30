package com.example.fy_wy.cal;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import java.lang.String;





public class    MainActivity extends AppCompatActivity {
    int op = 0;
    int time = 0;
    double num1 = 0, num2 = 0;
    double Result = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but_one = (Button) findViewById(R.id.buttonOne);
        Button but_two = (Button) findViewById(R.id.buttonTwo);
        Button but_three = (Button) findViewById(R.id.buttonThree);
        Button but_four = (Button) findViewById(R.id.buttonFour);
        Button but_five = (Button) findViewById(R.id.buttonFive);
        Button but_six = (Button) findViewById(R.id.buttonSix);
        Button but_seven = (Button) findViewById(R.id.buttonSeven);
        Button but_eight = (Button) findViewById(R.id.buttonEight);
        Button but_nine = (Button) findViewById(R.id.buttonNine);
        Button but_zero = (Button) findViewById(R.id.buttonZero);
        Button but_add = (Button) findViewById(R.id.buttonAdd);
        Button but_minus = (Button) findViewById(R.id.buttonMinus);
        Button but_multiply = (Button) findViewById(R.id.buttonMultiply);
        Button but_divide = (Button) findViewById(R.id.buttonDivide);
        Button but_equal = (Button) findViewById(R.id.buttonEqual);
        Button but_clear = (Button) findViewById(R.id.buttonClear);
        Button but_point = (Button) findViewById(R.id.buttonpoint);
        Button but_square = (Button) findViewById(R.id.buttonSquare);
        but_one.setOnClickListener(new MyclickListener());
        but_two.setOnClickListener(new MyclickListener());
        but_three.setOnClickListener(new MyclickListener());
        but_four.setOnClickListener(new MyclickListener());
        but_five.setOnClickListener(new MyclickListener());
        but_six.setOnClickListener(new MyclickListener());
        but_seven.setOnClickListener(new MyclickListener());
        but_eight.setOnClickListener(new MyclickListener());
        but_nine.setOnClickListener(new MyclickListener());
        but_zero.setOnClickListener(new MyclickListener());
        but_point.setOnClickListener(new MyclickListener());
        but_clear.setOnClickListener(new MyclickListener());
        but_add.setOnClickListener(new MyclickListener());
        but_minus.setOnClickListener(new MyclickListener());
        but_multiply.setOnClickListener(new MyclickListener());
        but_divide.setOnClickListener(new MyclickListener());
        but_equal.setOnClickListener(new MyclickListener());
        but_square.setOnClickListener(new MyclickListener());
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.fy_wy.cal/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.fy_wy.cal/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    class MyclickListener implements View.OnClickListener {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);

        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.buttonOne:
                    editText1.setText(editText1.getText() + "1");
                    break;
                case R.id.buttonTwo:
                    editText1.setText(editText1.getText() + "2");
                    break;
                case R.id.buttonThree:
                    editText1.setText(editText1.getText() + "3");
                    break;
                case R.id.buttonFour:
                    editText1.setText(editText1.getText() + "4");
                    break;
                case R.id.buttonFive:
                    editText1.setText(editText1.getText() + "5");
                    break;
                case R.id.buttonSix:
                    editText1.setText(editText1.getText() + "6");
                    break;
                case R.id.buttonSeven:
                    editText1.setText(editText1.getText() + "7");
                    break;
                case R.id.buttonEight:
                    editText1.setText(editText1.getText() + "8");
                    break;
                case R.id.buttonNine:
                    editText1.setText(editText1.getText() + "9");
                    break;
                case R.id.buttonZero:
                    editText1.setText(editText1.getText() + "0");
                    break;
                case R.id.buttonpoint:
                    editText1.setText(editText1.getText() + ".");
                    break;
                case R.id.buttonClear:
                    editText1.setText(null);
                    editText3.setText(null);
                    op = 0;
                    time = 0;
                    break;
                case R.id.buttonAdd:
                    try {
                        if (time == 0) {
                            editText2.setText(editText1.getText());
                            editText1.setText(null);
                            time = 1;
                            op = 1;
                        } else {
                            String myString1 = editText1.getText().toString();
                            num1 = Double.valueOf(myString1);
                            String myString2 = editText2.getText().toString();
                            num2 = Double.valueOf(myString2);
                            Result = num2 + num1;
                            editText3.setText(String.valueOf(Result));
                            editText2.setText(String.valueOf(Result));
                            editText1.setText(null);
                        }
                    } catch (Exception e) {
                    }
                    break;
                case R.id.buttonMinus:
                    try {
                        if (time == 0) {
                            editText2.setText(editText1.getText());
                            editText1.setText(null);
                            op = 2;
                            time = 2;
                        } else {
                            String myString1 = editText1.getText().toString();
                            num1 = Double.valueOf(myString1);
                            try {
                                String myString2 = editText2.getText().toString();
                                num2 = Double.valueOf(myString2);
                            } catch (Exception e) {
                            }
                            Result = num2 - num1;
                            editText3.setText(String.valueOf(Result));
                            editText2.setText(String.valueOf(Result));
                            editText1.setText(null);
                            op = 2;
                        }
                    } catch (Exception e) {
                    }
                    break;
                case R.id.buttonMultiply:
                    try {
                        if (time == 0) {
                            editText2.setText(editText1.getText());
                            editText1.setText(null);
                            op = 3;
                            time = 3;
                        } else {
                            String myString1 = editText1.getText().toString();
                            num1 = Double.valueOf(myString1);
                            try {
                                String myString2 = editText2.getText().toString();
                                num2 = Double.valueOf(myString2);
                            } catch (Exception e) {
                            }
                            Result = num2 * num1;
                            editText3.setText(String.valueOf(Result));
                            editText2.setText(String.valueOf(Result));
                            editText1.setText(null);
                            op = 3;
                        }
                    } catch (Exception e) {
                    }
                    break;
                case R.id.buttonDivide:
                    try {
                        if (time == 0) {
                            editText2.setText(editText1.getText());
                            editText1.setText(null);
                            op = 4;
                            time = 4;
                        } else {
                            String myString1 = editText1.getText().toString();
                            num1 = Double.valueOf(myString1);
                            try {
                                String myString2 = editText2.getText().toString();
                                num2 = Double.valueOf(myString2);
                            } catch (Exception e) {
                            }
                            Result = num2 / num1;
                            editText3.setText(String.valueOf(Result));

                            editText1.setText(null);
                            op = 4;
                        }
                    } catch (Exception e) {
                    }
                    break;
                case R.id.buttonSquare:
                    if (time == 0) {
                        editText2.setText(editText1.getText());
                        editText1.setText(null);
                        op = 7;
                    } else editText1.setText("函数格式错误");
                    break;
                case R.id.buttonEqual:
                    try {
                        String myString1 = editText1.getText().toString();
                        num1 = Double.valueOf(myString1);
                    } catch (Exception e) {
                    }
                    try {
                        String myString2 = editText2.getText().toString();
                        num2 = Double.valueOf(myString2);
                    } catch (Exception e) {
                    }
                    switch (op) {
                        case 0:
                            Result = num1;
                            break;
                        case 1:
                            Result = num2 + num1;
                            break;
                        case 2:
                            Result = num2 - num1;
                            break;
                        case 3:
                            Result = num2 * num1;
                            break;
                        case 4:
                            if (num1 == 0) {
                                editText1.setText("除数为0");
                            }
                            Result = num2 / num1;
                            break;
                        case 5:
                            Result = Math.sin(num2 * Math.PI / 180);
                            break;
                        case 6:
                            Result = Math.cos(num2 * Math.PI / 180);
                            break;
                        case 7:
                            Result = (int) Math.pow(num2, num1);
                            break;
                        default:
                            break;
                    }
                    editText3.setText(String.valueOf(Result));

                    break;

            }
        }
    }
}
