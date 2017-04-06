package com.example.sumeet.simpleadditionfragmentsassignment1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleAddition_Fragment extends Fragment {

    EditText editText;
    TextView textView;
    Button btnSubmit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_simple_addition_, container, false);
        btnSubmit = (Button) myView.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });


        return myView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        editText = (EditText) view.findViewById(R.id.editTextDisplay);
        textView = (TextView) view.findViewById(R.id.textViewDisplay);
        btnSubmit = (Button) view.findViewById(R.id.btnSubmit);
    }
}
