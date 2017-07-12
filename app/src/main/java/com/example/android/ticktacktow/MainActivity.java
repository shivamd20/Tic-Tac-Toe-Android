package com.example.android.ticktacktow;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String arr[][] = new java.lang.String[3][3];
    int count = 0;
    View ass;
    int ramu=0,kalu=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Snackbar.make(view, "First Player turn", Snackbar.LENGTH_LONG)
                                               .setAction("Action", null).show();
                                       Default();
                                       ramu=kalu=0;
                                       showAll();
                                   }
                               }

        );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void display(View view) {
        showAll();
    }
    public void showAll() {

        if(ramu==kalu)
        {
            Button t11 = (Button) findViewById(R.id.t11);
            t11.setText(arr[0][0]);
            Button t12 = (Button) findViewById(R.id.t12);
            t12.setText(arr[0][1]);
            Button t13 = (Button) findViewById(R.id.t13);
            t13.setText(arr[0][2]);
            Button t21 = (Button) findViewById(R.id.t21);
            t21.setText(arr[1][0]);
            Button t22 = (Button) findViewById(R.id.t22);
            t22.setText(arr[1][1]);
            Button t23 = (Button) findViewById(R.id.t23);
            t23.setText(arr[1][2]);
            Button t31 = (Button) findViewById(R.id.t31);
            t31.setText(arr[2][0]);
            Button t32 = (Button) findViewById(R.id.t32);
            t32.setText(arr[2][1]);
            Button t33 = (Button) findViewById(R.id.t33);
            t33.setText(arr[2][2]);
        }


            check();
            if(ramu>kalu)
            {
                TextView result=(TextView) findViewById(R.id.result);
                result.setText("First player won");



            }
            else if(kalu>ramu)
            {
                TextView result=(TextView) findViewById(R.id.result);
                result.setText("Second player won");


            }
        }



    public void Default() {
        TextView result=(TextView) findViewById(R.id.result);
        result.setText(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = " ";
            }
        }

    }

    public void t00(View view) {
        if (count == 0) {

            //checks
            if(arr[0][0]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[0][0]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[0][0] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
       else if(arr[0][0]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
       else  if(arr[0][0]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
           else if (count == 1) {
                arr[0][0] = "O";
                count = 0;
                Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }


    }
    public void t01(View view) {
        if (count == 0) {
            if(arr[0][1]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[0][1]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[0][1] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
      else  if(arr[0][1]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[0][1]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[0][1] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t02(View view) {
        if (count == 0) {
            if(arr[0][2]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[0][2]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[0][2] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
       else if(arr[0][2]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[0][2]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[0][2] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t10(View view) {
        if (count == 0) {
            if(arr[1][0]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[1][0]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[1][0] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
      else  if(arr[1][0]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[1][0]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[1][0] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t11(View view) {
        if (count == 0) {
            if(arr[1][1]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[1][1]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[1][1] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
     else   if(arr[1][1]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[1][1]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[1][1] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t12(View view) {
        if (count == 0) {
            if(arr[1][2]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[1][2]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[1][2] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
      else  if(arr[1][2]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[1][2]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[1][2] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t20(View view) {
        if (count == 0) {
            if(arr[2][0]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[2][0]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[2][0] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
    else    if(arr[2][0]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[2][0]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[2][0] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t21(View view) {
        if (count == 0) {
            if(arr[2][1]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[2][1]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[2][1] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
     else   if(arr[2][1]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[2][1]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[2][1] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
    public void t22(View view) {
        if (count == 0) {
            if(arr[2][2]=="X")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();

            }
            if(arr[2][2]=="O")
            {
                Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }
            else {
                arr[2][2] = "X";
                count = 1;
                Snackbar.make(view, "Second Player Turn", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                showAll();
            }

        }
      else  if(arr[2][2]=="X")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else  if(arr[2][2]=="O")
        {
            Snackbar.make(view,"invalid move", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();
        }
        else if (count == 1) {
            arr[2][2] = "O";
            count = 0;
            Snackbar.make(view, "First Player Turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            showAll();

        }


    }
   public void check()
    {


        for(int i=0;i<3;i++)
        {
            if(arr[i][0]==arr[i][1])
            {
                if(arr[i][1]==arr[i][2])
                {
                    if(arr[i][0]=="X")
                    {

                        ramu++;
                        break;
                    }
                    else
                    {
                        if(arr[i][0]=="O")	{ kalu++; }

                        break;
                    }
                }

            }
            if(arr[0][i]==arr[1][i])
            {
                if(arr[1][i]==arr[2][i])
                {
                    if(arr[0][i]=="X")
                    {

                        ramu++;

                        break;
                    }
                    else
                    {
                        if(arr[0][i]=="O") kalu++;

                        break;
                    }
                }

            }
            if(arr[0][0]==arr[1][1])
            {
                if(arr[1][1]==arr[2][2])
                {
                    if(arr[0][0]=="X")
                    {

                        ramu++;

                        break;
                    }
                    else
                    {
                        if(arr[0][0]=="O") {
                            kalu++;};

                        break;

                    }
                }

            }
            if(arr[0][2]==arr[1][1])
            {
                if(arr[1][1]==arr[2][0])
                {
                    if(arr[1][1]=="X")
                    {

                        ramu++;

                        break;
                    }
                    else
                    {
                        if(arr[1][1]=="O"){
                            kalu++;}

                        break;

                    }
                }

            }




        }

    }
}
