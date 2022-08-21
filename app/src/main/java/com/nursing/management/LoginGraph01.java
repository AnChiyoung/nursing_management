package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class LoginGraph01 extends AppCompatActivity {

    public static int count = 0;
    LineChart lineChart = null;
    ArrayList<Entry> entries = null;
    LineDataSet dataSet = null;
    ArrayList<String> labels = null;
    LineData data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.logingraph01);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lineChart = (LineChart)findViewById(R.id.graph01);
        entries = new ArrayList<>();
        Load();
    }

    @SuppressLint("StaticFieldLeak")
    public void Load() {
        new AsyncTask<Void, Void, Void>() {

            ProgressDialog progressDialog = new ProgressDialog(LoginGraph01.this);

            @Override
            protected void onPreExecute() {
                lineChart.invalidate();
                count = 0;
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage("데이터를 불러오는 중입니다");
                progressDialog.setCancelable(false);
                progressDialog.show();
            }

            @SuppressLint("StaticFieldLeak")
            @Override
            protected Void doInBackground(Void... voids) {
                JSONArray result = new ServerConnect().execQuery(null, "SELECT login_count FROM user ORDER BY login_count DESC");
                Log.d("haha", result.toString());
                try {
                    Thread.sleep(500);
                    if(!result.toString().equals("[777]")) {
                        if(!result.toString().equals("[444]")) {
                            for(int i = 0; i < result.length(); i++) {
                                entries.add(new Entry(i, result.getJSONObject(i).getInt("login_count")));
                                Log.d("count?", String.valueOf(i));
                            }
                        }
                    }
                } catch(InterruptedException | JSONException unused) {
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                progressDialog.dismiss();
                dataSet = new LineDataSet(entries, "로그인 횟수");
                dataSet.setDrawIcons(false);
                dataSet.enableDashedLine(10f, 5f, 0f);
                dataSet.enableDashedHighlightLine(10f, 5f, 0f);
                dataSet.setColor(Color.DKGRAY);
                dataSet.setCircleColor(Color.DKGRAY);
                dataSet.setLineWidth(1f);
                dataSet.setCircleRadius(3f);
                dataSet.setDrawCircleHole(false);
                dataSet.setValueTextSize(9f);
                dataSet.setDrawFilled(true);
                dataSet.setFormLineWidth(1f);
                dataSet.setFormLineDashEffect(new DashPathEffect(new float[]{10f, 5f}, 0f));
                data = new LineData(dataSet);
                lineChart.setData(data);
                lineChart.setDoubleTapToZoomEnabled(false);
                lineChart.setDrawGridBackground(false);
                lineChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter());
                lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM); //가로축 아래로
                lineChart.animateY(1000);

            }
        }.execute();
    }
}