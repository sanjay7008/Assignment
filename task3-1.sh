#!/bin/bash
N=$1
if [ $N -lt 10 ]; then
        OUT=$((N*N)) # Line 6: Added missing parentheses around the expression
elif [ $N -lt 20 ]; then
        OUT=1
        LIM=$((N - 10))
        for (( i=1; i<=LIM; i++ )) # Line 10: Changed "<" to "<=" to include the upper limit
        do
                OUT=$((OUT * i))
        done
else
        LIM=$((N - 20))
        OUT=0 # Line 16: Corrected the initial value of OUT to 0 for sum calculation
        for (( i=1; i<=LIM; i++ )) # Line 17: Changed "<" to "<=" to include the upper limit
        do
                OUT=$((OUT + i)) # Line 18: Changed * to + for sum calculation
        done
fi
echo $OUT
