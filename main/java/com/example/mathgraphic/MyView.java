package com.example.mathgraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.jar.Attributes;

public class MyView extends View {

    //paint 목록
    Paint p1 = new Paint();
    Paint p2 = new Paint();//빨간색
    Paint p3 = new Paint();//파란색
    Paint p4 = new Paint();//노란색
    Paint p5 = new Paint();//녹색
    Paint p6 = new Paint();//핑크색
    Paint p7 = new Paint(); //보라색
    Paint p8 = new Paint();//지우기(하얀색)




    int myData_x[] = new int[30000];
    int myData_y[] = new int[30000];
    int myData_color[] = new int[30000];

    static int radius = 15;

    int dataNumber =0;
    int mx, my;
    static int whatColor = 0;

    public MyView(Context context, AttributeSet attr){

        super(context);
        p1.setColor(Color.BLACK);
        p2.setColor(Color.RED);
        p3.setColor(Color.BLUE);
        p4.setColor(Color.YELLOW);
        p5.setColor(Color.GREEN);
        p6.setColor(Color.MAGENTA);
        p7.setColor(Color.CYAN);
        p8.setColor(Color.WHITE);

        myData_x[0]=0;
        myData_y[0]=0;
        myData_color[0]=0;

    }
    @Override
    public void onDraw(Canvas canvas){
        //터치한 개수만큼 반복한다
        for(int i=0; i<= dataNumber; i++){
            if(myData_color[i]==0){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p1);
            }
            if(myData_color[i]==1){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p2);
            }
            if(myData_color[i]==2){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p3);
            }
            if(myData_color[i]==3){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p4);
            }
            if(myData_color[i]==4){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p5);
            }
            if(myData_color[i]==5){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p6);
            }
            if(myData_color[i]==6){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p7);
            }
            if(myData_color[i]==7){
                canvas.drawCircle(myData_x[i], myData_y[i], radius, p8);
            }
            invalidate();


        }
    }

    public void saveData(){
        myData_x[dataNumber]=mx;
        myData_y[dataNumber]=my;
        myData_color[dataNumber]=whatColor;
    }

    public boolean onTouchEvent(MotionEvent event){

        mx =(int) event.getX();
        my =(int) event.getY();

        dataNumber += 1;
        saveData();
        return true;
    }
}
