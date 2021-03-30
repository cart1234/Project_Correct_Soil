package com.soil;

public class Calculos_CorrecaoFosforo extends App {
    public double quantidadeAplicar(double teor_fosforoAtingir,double fonte_fosforo, double teor_fosforo,double eficiencia_fosforo)
    {
        double teor_p2O5 = 1;
        double quantidade_aplicar;

        if((teor_fosforoAtingir - teor_fosforo)<0.01){
            quantidade_aplicar = 0;
            return quantidade_aplicar;
        }
        else{
            if(fonte_fosforo == 1){
                teor_p2O5 = 18;
            }else if(fonte_fosforo == 2){
                teor_p2O5 = 41;
            }
            else if(fonte_fosforo == 3){
                teor_p2O5 = 48;
            }
            else if(fonte_fosforo == 4){
                teor_p2O5 = 45;
            }
            else if(fonte_fosforo == 5){
                teor_p2O5 = 18;
            }
            else if(fonte_fosforo == 6){
                teor_p2O5 = 33;
            }
            else if(fonte_fosforo == 7){
                teor_p2O5 = 29;
            }
            else if(fonte_fosforo == 8){
                teor_p2O5 = 32;
            }
            else if(fonte_fosforo == 9){
                teor_p2O5 = 24;
            }
            else if(fonte_fosforo == 10){
                teor_p2O5 = 18.5;
            }
            else if(fonte_fosforo == 11){
                teor_p2O5 = 52;
            }
            else if(fonte_fosforo == 12){
                teor_p2O5 = 18;
            }
            quantidade_aplicar = (((teor_fosforoAtingir - teor_fosforo)*2*2.29)*100/eficiencia_fosforo/100)*100/teor_p2O5;
            return quantidade_aplicar;
        }
    }
    public double superfosfato_Simples(double teor_fosforoAtingir,double fonte_fosforo, double quantidade_aplicar, double teor_fosforo,double eficiencia_fosforo) 
    {
        double teor_p2O5 = 1;
        
        if(fonte_fosforo == 5){
            return (quantidade_aplicar*0.15);
        }else{
            if(fonte_fosforo == 1){
                teor_p2O5 = 18;
            }else if(fonte_fosforo == 2){
                teor_p2O5 = 41;
            }
            else if(fonte_fosforo == 3){
                teor_p2O5 = 48;
            }
            else if(fonte_fosforo == 4){
                teor_p2O5 = 45;
            }
            else if(fonte_fosforo == 5){
                teor_p2O5 = 18;
            }
            else if(fonte_fosforo == 6){
                teor_p2O5 = 33;
            }
            else if(fonte_fosforo == 7){
                teor_p2O5 = 29;
            }
            else if(fonte_fosforo == 8){
                teor_p2O5 = 32;
            }
            else if(fonte_fosforo == 9){
                teor_p2O5 = 24;
            }
            else if(fonte_fosforo == 10){
                teor_p2O5 = 18.5;
            }
            else if(fonte_fosforo == 11){
                teor_p2O5 = 52;
            }
            else if(fonte_fosforo == 12){
                teor_p2O5 = 18;
            }
            double mmb24 = (((teor_fosforoAtingir - teor_fosforo)*2*2.29*100)/eficiencia_fosforo/100)*100/teor_p2O5*2.42;
            if(fonte_fosforo == 1){
                return (mmb24*0.1/(2.42));
            }
            else if(fonte_fosforo == 12){
                return (mmb24*0.11/(2.42));
            }
            return 0.0;
        }
    }
   public double custoFosforo(double fonte_fosforo,double quantidade_aplicar, double valor_superfosfato_simples)
    {
        System.out.printf("qaplicar= %.2f\n",quantidade_aplicar);

        if(fonte_fosforo >=1 && fonte_fosforo<=12)
        {
            return (valor_superfosfato_simples*quantidade_aplicar/1000);
        }
        return 0.0;
    }
    public double enxofre(double quantidade_aplicar, double fonte_fosforo){
        if(fonte_fosforo ==1)
        {
            return (quantidade_aplicar*0.28);
        }else if(fonte_fosforo ==2){
            return (quantidade_aplicar*0.2);
        }else if(fonte_fosforo ==3){
            return (quantidade_aplicar*0.09);
        }
        else if(fonte_fosforo ==4){
            return (quantidade_aplicar*0.16);

        }else if(fonte_fosforo ==5){
            return (quantidade_aplicar*0.28);

        }else if(fonte_fosforo ==6){
            return (quantidade_aplicar*0.52);

        }else if(fonte_fosforo ==7){
            return (quantidade_aplicar*0.53);

        }else if(fonte_fosforo ==8){
            return (quantidade_aplicar*0.45);

        }else if(fonte_fosforo ==9){
            return (quantidade_aplicar*0.28);

        }
        else if(fonte_fosforo ==10){
            return (quantidade_aplicar*0.44);

        }else if(fonte_fosforo ==11){
            return (quantidade_aplicar*0.0);

        }else if(fonte_fosforo ==12){
            return (quantidade_aplicar*0.18);

        }
        return 0.0;
    }

}

