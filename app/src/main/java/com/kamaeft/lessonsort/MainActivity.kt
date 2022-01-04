package com.kamaeft.lessonsort


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kamaeft.lessonsort.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val array2 = arrayOf(100, 4, 134, 14, 1022, 17)
        bubbleSort(array2)


    }

    private fun bubbleSort (array: Array<Int>):Array<Int> {
        var done : Boolean = false
        while (done == false) {
            var index: Int = 0
            done = true
            while (index <  array.size -1 ) { // Move through the array

                if (array[index] > array[index + 1]) { // If the next item is larger than current

                    // Swap them
                    val tmp = array[index]
                    array[index] = array[index + 1]
                    array[index + 1] = tmp

                    // Mark as not done
                    done = false
                }

                //print the array
                for (element in array) {
                    element.toString() + 1
                }
                    index++

                binding.tvArrayResult.text = array.contentToString()
            }
        }
        return (array)

    }


}