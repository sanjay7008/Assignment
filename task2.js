var arr = ["2+4", "4-5", "11/2", 'end'];


var body = {
    "expr": [],
    "precision": 14
}

arr.forEach((element)=>{
    if(element !== 'end'){
        body.expr.push(element);
    }
    else{
        return;
    }
})

console.log(body.expr);

async function getResult(body){
    const result = await fetch('http://api.mathjs.org/v4/', {
        method: 'POST',
        body: JSON.stringify(body),
        headers: {'content-type': 'application/json'}
    })
    .then((response=>response.json()))
    .then((data)=>{console.log(data.result)});
} 

getResult(body);

