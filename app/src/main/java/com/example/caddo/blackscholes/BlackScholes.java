package com.example.caddo.blackscholes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.text.NumberFormat;
import java.util.Scanner;
import org.apache.commons.Parser;

public class BlackScholes extends AppCompatActivity {

    public static double calculateBlackScholes(
            double S, int t, double K, double v, double r, double T
    ) {

    //Calculate d1, d2
        double d1 = v * Math.sqrt(T - t) * (Math.log(S/K) + (r + v/2) * (T - t));
        double d2 = d1 - Math.sqrt(v) * Math.sqrt(T-t);

        //Normal distribution of d1, d2
        //double Nd1 = Math.NormalDistribution
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_scholes);
    }
}
