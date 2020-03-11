package com.example.chocolate;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SaudiActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent mainIntent;

            switch (item.getItemId()) {
                case R.id.navigation_history:
                    mainIntent = new Intent(SaudiActivity.this, HistoryActivity.class);
                    SaudiActivity.this.startActivity(mainIntent);
                    SaudiActivity.this.finish();
                    //mTextMessage.setText(R.string.title_UAE);
                    return true;
                case R.id.navigation_UAE:
                    mainIntent = new Intent(SaudiActivity.this, UAEActivity.class);
                    SaudiActivity.this.startActivity(mainIntent);
                    SaudiActivity.this.finish();
                    //mTextMessage.setText(R.string.title_UAE);
                    return true;
                case R.id.navigation_home:
                    mainIntent = new Intent(SaudiActivity.this, HomeActivity.class);
                    SaudiActivity.this.startActivity(mainIntent);
                    SaudiActivity.this.finish();
                    return true;
                case R.id.navigation_SA:
                    //mainIntent = new Intent(HistoryActivity.this, SaudiActivity.class);
                    //HistoryActivity.this.startActivity(mainIntent);
                    //HistoryActivity.this.finish();
                    //mTextMessage.setText(R.string.title_UAE);
                    return true;
                case R.id.navigation_Trends:
                    mainIntent = new Intent(SaudiActivity.this, TrendsActivity.class);
                    SaudiActivity.this.startActivity(mainIntent);
                    SaudiActivity.this.finish();
                    //mTextMessage.setText(R.string.title_UAE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saudi);

        getSupportActionBar().setTitle("Chocolate In the Middle East"); // for set actionbar title
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#654321")));

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.getMenu().findItem(R.id.navigation_SA).setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.intro) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Why Chocolate as a Topic?");
            builder.setMessage("Almost everyone at one point or other has tasted a creamy, velvety piece of chocolate that just instantly melts in your mouth. Those in the Middle East are not exempt from this experience.  I personally love chocolate, white chocolate, dark chocolate, with hazelnut, toffee or even caramel, the list goes on.  Given my love of chocolate, I thought it would be interesting to learn more about how those in the Middle East feel about this commodity and why it had such an exceptionally high growth rate in the region over the past few years. The first section gives much need background on chocolate, the second and third sections explore Saudi Arabia and the UAE as they consume the most chocolate in the region and lastly, the fourth section discusses market trends and the growth rate of Middle East chocolate.  A Bibliography and more can be found in the menu drawer on the app bar.  ");
            builder.setNeutralButton("Let's Go!", null);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return true;
        } else if (id == R.id.sources){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Bibliography");
            builder.setMessage(
                    "Sources: \n\n\"Over 11 million pieces of fine chocolate fly on Emirates every year.\" Khaleej Times [Dubai, United Arab Emirates], 5 July 2019. Gale OneFile: News, https://link.gale.com/apps/doc/A592241265/STND?u=nysl_li_hofs&sid=STND&xid=264ceaa7. Accessed 28 Nov. 2019.\n"
                    + "\n\"World Chocolate Day: What to do in the UAE.\" Gulf News [United Arab Emirates], 6 July 2018. Gale OneFile: News, https://link.gale.com/apps/doc/A545589320/STND?u=nysl_li_hofs&sid=STND&xid=ec624087. Accessed 28 Nov. 2019.\n" +
                    "\n\"UAE-based Al Nassma to take camel milk chocolates to airports worldwide.\" Gulf News [United Arab Emirates], 24 June 2014. Gale OneFile: News, https://link.gale.com/apps/doc/A372454780/STND?u=nysl_li_hofs&sid=STND&xid=616e0972. Accessed 29 Nov. 2019.\n" +
                    "\n\"GOURMET FOOD /: CAMELS' MILK CHOCOLATE.\" Globe & Mail [Toronto, Canada], 25 July 2009, p. L7. Gale OneFile: News, https://link.gale.com/apps/doc/A204401986/STND?u=nysl_li_hofs&sid=STND&xid=6fd6f1b8. Accessed 29 Nov. 2019.\n" +
                    "\nhttp://www.mjpath.org.my/2013.2/history-and-science-of-chocolate.pdf\n" +
                    "\nhttps://www.hoteliermiddleeast.com/14336-top-10-chocolate-trends-in-the-middle-east\n" +
                    "\nhttps://www.mordorintelligence.com/industry-reports/middle-east-and-africa-chocolate-market\n" +
                    "\nhttps://www.mordorintelligence.com/industry-reports/middle-east-and-africa-chocolate-market\n");
            builder.setNeutralButton("Cool!", null);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return true;
        } else if (id == R.id.word_count){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Word Count");
            builder.setMessage("The content is made up of 3,186 words.");
            builder.setNeutralButton("Awesome!", null);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}