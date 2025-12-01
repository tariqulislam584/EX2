{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 fun main() \{\
    // 1. Create a list of integers (20+ integers)\
    val numbers = (1..50).toList()\
\
    // 2. Use filter \{ ... \} -> even numbers\
    val evens = numbers.filter \{ it % 2 == 0 \}\
\
    // 3. Use map \{ ... \} -> squares of each number\
    // Applying 'map' to the original list for simplicity of demonstration,\
    // though the prompt implies a sequence. For a simple demonstration,\
    // we'll map the *evens* to their squares to show chaining, or map the original.\
    // Following the standard interpretation: map the evens found in the previous step.\
    val evenSquares = evens.map \{ it * it \}\
\
    // 4. Use reduce \{ acc, n -> ... \} -> sum of all numbers\
    // Calculating the sum of the *squares of the even numbers*.\
    // If the list is empty (which it won't be here), reduce throws an error.\
    // 'fold' or 'sum()' is often safer/more idiomatic for sums, but 'reduce' is requested.\
    val sumOfEvenSquares = if (evenSquares.isNotEmpty()) \{\
        evenSquares.reduce \{ acc, n -> acc + n \}\
    \} else \{\
        0\
    \}\
\
    // Print results with clear labels\
    println("--- Results ---")\
    println("Original List Size: $\{numbers.size\}")\
    println("Evens: $\{evens.size\} numbers")\
    // Print the first 10 evens for brevity\
    println("Evens (Sample): $\{evens.take(10)\}$\{if (evens.size > 10) "..." else ""\}")\
    println("---")\
    println("Squares: $\{evenSquares.size\} numbers")\
    // Print the first 10 squares for brevity\
    println("Squares (Sample): $\{evenSquares.take(10)\}$\{if (evenSquares.size > 10) "..." else ""\}")\
    println("---")\
    println("Sum: $sumOfEvenSquares")\
    println("---------------")\
\}}