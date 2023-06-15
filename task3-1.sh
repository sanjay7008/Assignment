#!/bin/bash
N=$1
if [ $N -lt 10 ];  #added semi colon
then
        OUT=$((N*N))
elif [ $N -le 20 ]; # added semi colon     #changed less than operator to less than or equal to operator
then
        OUT=1
        LIM=$((N - 10))
        for (( i=1; i<=$LIM; i++ )); # added semi colon     #changed less than operator to less than or equal to operator
        do
                OUT=$((OUT * i))
        done
else
        LIM=$((N - 20))
        OUT=$((LIM * LIM))
        OUT=$((OUT + LIM)) #changed - operator to +operator
        OUT=$((OUT / 2))
fi
echo $OUT
