package com.example.sum2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.math.abs
import kotlin.math.sin
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btResult)
        val edtxt1: EditText = findViewById(R.id.ednum1)
        val edtxt2: EditText = findViewById(R.id.ednum2)
        val resultTV: TextView = findViewById(R.id.textResult)
        var flag : String = "sum"
        val spinnerVal : Spinner = findViewById(R.id.spinnerV)
        var options = arrayOf("sum","multiply","Absolute Value","subtract","divide","sinnumber","max","min","countyourage ")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        button.setOnClickListener{ view ->

            var x: Float = edtxt1.text.toString().toFloat();
            var y: Float = edtxt2.text.toString().toFloat();

            if (flag == "sum")
                resultTV.text = sum(x,y).toString();
            else if (flag == "multiply")
                resultTV.text = multiply(x,y).toString();
            else if (flag == "AbsoluteValue")
                resultTV.text = AbsoluteValue(x).toString();
            else if (flag == "subtract")
                resultTV.text = subtract(x,y).toString();
            else if (flag == "divide")
                resultTV.text = divide(x,y).toString();
            else if (flag == "sinnumber")
                resultTV.text = sinnumber(x).toString();
            else if (flag == "max")
                resultTV.text = max(x,y).toString();
            else if (flag == "min")
                resultTV.text = min(x,y).toString();
            else if (flag == "countyourage")
                resultTV.text = countyourage(x).toString();

        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        button.setOnClickListener{ view ->
            var x: Float = edtxt1.text.toString().toFloat();
            var y: Float = edtxt2.text.toString().toFloat()
            if(flag =="sum")
                resultTV.text = sum(x,y).toString();
            else if (flag == "multiply")
                resultTV.text = multiply(x,y).toString();
            else if (flag == "AbsoluteValue")
                resultTV.text = AbsoluteValue(x).toString();
            else if (flag == "subtract")
                resultTV.text = subtract(x,y).toString();
            else if (flag == "divide")
                resultTV.text = divide(x,y).toString();
            else if (flag == "sin")
                resultTV.text = sinnumber(x).toString();
            else if (flag == "max")
                resultTV.text = max(x,y).toString();
            else if (flag == "min")
                resultTV.text = min(x,y).toString();
            else if (flag == "countyourage")
                resultTV.text = countyourage(x).toString();
        }
    }
}




public fun sum(a: Float, b: Float): Float{
    return a+b;
}
public fun multiply(a: Float, b:Float): Float {
    return a*b
}
public fun subtract(a:Float, b: Float): Float {
    return a-b
}
public fun divide(a: Float, b: Float): Float {
    return a/b
}
public fun AbsoluteValue(a: Float): Float {
    return abs(a)
}
private fun sinnumber(a: Float): Float {
    return sin(a)
}

public fun max(a: Float, b: Float): Float {
    if (a>b){
        return a}
    else if (a==b){
        return a}
    else
        return b

}

public fun min(a: Float, b: Float): Float {
    if (a<b){
        return a}
    else if (a==b){
        return a}
    else
        return b

}

public fun countyourage(a: Float): Float {
    return 2022-a

}
