package com.tictactoe.smn.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b1.setText("X");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b2.setText("X");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b3.setText("X");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b4.setText("X");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b5.setText("X");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b6.setText("X");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b7.setText("X");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b8.setText("X");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("O");
                    }
                    else if (turn == 2) {
                        turn = 1;
                        b9.setText("X");
                    }
                }
                endGame();
            }
        });
    }
    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        Boolean end=false;

        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if(b.equals("O") && c.equals("O") && a.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("O") && g.equals("O") && a.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("O") && i.equals("O") && a.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("O") && h.equals("O") && b.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(f.equals("O") && i.equals("O") && c.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("O") && f.equals("O") && d.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(h.equals("O") && i.equals("O") && g.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("O") && g.equals("O") && c.equals("O")){
            Toast.makeText(this,"Player O won!", Toast.LENGTH_LONG).show();
            end=true;
        }


        if(b.equals("X") && c.equals("X") && a.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("X") && g.equals("X") && a.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("X") && i.equals("X") && a.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("X") && h.equals("X") && b.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(f.equals("X") && i.equals("X") && c.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("X") && f.equals("X") && d.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(h.equals("X") && i.equals("X") && g.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(e.equals("X") && g.equals("X") && c.equals("X")){
            Toast.makeText(this,"Player X won!", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(!a.equals("") && !b.equals("") && !c.equals("") && !d.equals("") && !e.equals("") && !f.equals("") && !g.equals("") && !h.equals("") && !i.equals("")){
            Toast.makeText(this,"Match Drawn!", Toast.LENGTH_LONG).show();
            end=true;
        }


        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Do you want to play again?");
                    alertDialogBuilder.setPositiveButton("yes",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface arg0, int arg1) {
                                    b1.setText("");
                                    b2.setText("");
                                    b3.setText("");
                                    b4.setText("");
                                    b5.setText("");
                                    b6.setText("");
                                    b7.setText("");
                                    b8.setText("");
                                    b9.setText("");

                                    b1.setEnabled(true);
                                    b2.setEnabled(true);
                                    b3.setEnabled(true);
                                    b4.setEnabled(true);
                                    b5.setEnabled(true);
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                    b8.setEnabled(true);
                                    b9.setEnabled(true);

                                    turn=1;
                                }
                            });

            alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }




    }
}
