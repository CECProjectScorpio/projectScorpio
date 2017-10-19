package com.example.cec.projectscorpio.branches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cec.projectscorpio.R;
import com.example.cec.projectscorpio.branches.civil.EighthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.FifthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.FourthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.SeventhSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.SixthSemCivilSubjectsListActivity;
import com.example.cec.projectscorpio.branches.civil.ThirdSemCivilSubjectsListActivity;

import java.util.ArrayList;


public class CESemesterListActivity extends AppCompatActivity {

    ListView semesterView;

    ArrayList<String> semesterList = new ArrayList<String>();

    ArrayAdapter semesterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_list);

        semesterList.add(getString(R.string.Third));
        semesterList.add(getString(R.string.Fourth));
        semesterList.add(getString(R.string.Fifth));
        semesterList.add(getString(R.string.Sixth));
        semesterList.add(getString(R.string.Seventh));
        semesterList.add(getString(R.string.Eighth));

        semesterView = (ListView) findViewById(R.id.semester_list);

        semesterAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, semesterList);

        semesterView.setAdapter(semesterAdapter);

        semesterView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if( i == 0 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, ThirdSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 0);
                }
                if( i == 1 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, FourthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 1);
                }
                if( i == 2 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, FifthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 2);
                }
                if( i == 3 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, SixthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 3);
                }
                if( i == 4 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, SeventhSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 4);
                }
                if( i == 5 ) {
                    Intent intent = new Intent(CESemesterListActivity.this, EighthSemCivilSubjectsListActivity.class);
                    startActivityForResult(intent, 5);
                }
            }
        });
    }
}
