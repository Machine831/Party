package com.example.party;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Party> parties = new ArrayList<Party>();
        parties.add(new Party(R.drawable.party1,"Праздник","12 апр.","445 м.","12:00","Санкт-Петербург, Дворцовая площадь","Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное "));
        parties.add(new Party(R.drawable.party2,"Вечеринка","10 июля","200 м.","18:00","Санкт-Петербург, ТокиоСити","Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное"));
        parties.add(new Party(R.drawable.conc,"Концерт","23 авг.","555 м.","19:30","Санкт-Петербург, КонцертХолл","Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное"));
        parties.add(new Party(R.drawable.party3,"День рождения","15 окг.","105 м.","13:30","Санкт-Петербург, MamaRoma","Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное"));
        parties.add(new Party(R.drawable.hermitage,"Выставка","3 дек.","450 м.","11:30","Санкт-Петербург, Эрмитаж","Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное"));

        Intent intent = new Intent(this,EventActivity.class);
        PartyAdapter partyAdapter = new PartyAdapter(parties,intent,this);
        recyclerView.setAdapter(partyAdapter);

    }
}
