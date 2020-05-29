package randomize.codeworks.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button num0=findViewById(R.id.num0);
        Button num1=findViewById(R.id.num1);
        Button num2=findViewById(R.id.num2);
        Button num3=findViewById(R.id.num3);
        Button num4=findViewById(R.id.num4);
        Button num5=findViewById(R.id.num5);
        Button num6=findViewById(R.id.num6);
        Button num7=findViewById(R.id.num7);
        Button num8=findViewById(R.id.num8);
        Button num9=findViewById(R.id.num9);
        Button add=findViewById(R.id.plus);
        final TextView disp=findViewById(R.id.disp);
        final ArrayList<Integer> listToAdd=new ArrayList<Integer>();
        final ArrayList<Integer> finalList=new ArrayList<Integer>();

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(0);
                disp.append("0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(1);
                disp.append("1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(2);
                disp.append("2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(3);
                disp.append("3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(4);
                disp.append("4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(5);
                disp.append("5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(6);
                disp.append("6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(7);
                disp.append("7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(8);
                disp.append("8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToAdd.add(9);
                disp.append("9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("+");
                if(!listToAdd.isEmpty())
                {
                    String str="";
                    for(int i:listToAdd )
                    {
                        str=str+i;
                    }
                listToAdd.clear();
                int num=Integer.parseInt(str);
                finalList.add(num);}


            }
        });
        Button enter =findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer sum=0;
                if(!finalList.isEmpty())
                {for(int i:finalList)
                {sum=sum+i;
                }
                String text;
                text = sum.toString();
                disp.setText(text);}

            }
        });
        Button del=findViewById(R.id.del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText(" ");
                finalList.clear();
                listToAdd.clear();
            }
        });





    }
}
