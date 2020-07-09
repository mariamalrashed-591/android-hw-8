package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();

    pokemon p = (pokemon) b.getSerializable("pokemon");

    TextView name = findViewById(R.id.name);
    TextView attack = findViewById(R.id.attack);
    TextView defense = findViewById(R.id.defense);
    TextView total = findViewById(R.id.total);
    ImageView image = findViewById(R.id.imageView2);

        name.setText(p.getName());
        attack.setText(p.getAttack()+"");
        defense.setText(p.getDefence()+"");
        total.setText(p.getTotal()+"");
        image.setImageResource(p.getImage());

}
}