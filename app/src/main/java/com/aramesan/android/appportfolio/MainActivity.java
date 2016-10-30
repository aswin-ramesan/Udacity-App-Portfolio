package com.aramesan.android.appportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * To convert the first letter of each word to CAPS
     * @param value
     * @return
     */
    private static String upperCaseAllFirst(String value) {

        char[] array = value.toCharArray();

        // Uppercase first letter.
        array[0] = Character.toUpperCase(array[0]);

        // Uppercase all letters that follow a whitespace character.
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        return new String(array);
    }

    /**
     * To display the toast based on the button clicked
     * @param view
     */
    public void displayToast(View view)
    {
        Button clickedButton = (Button) view;

        String btnText = clickedButton.getText().toString();
        String toastBtnText = upperCaseAllFirst(btnText.toLowerCase());

        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my " + toastBtnText + " project.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
