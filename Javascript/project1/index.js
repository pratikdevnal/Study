let a
let time 
let date

hours =()=>{
    if(a.getHours()<10){

        return 0 +''+a.getHours();
    }
    else
    {
        return a.getHours();
    }
}

min =()=>{
    if(a.getMinutes()<10){

        return 0 +''+a.getMinutes();
    }
    else
    {
        return a.getMinutes();
    }
}

sec =()=>{
    if(a.getSeconds()<10)
    {
        return 0+''+a.getSeconds();
    }
    else
    {
        return a.getSeconds();
    }
}


setInterval(() => { 
a = new Date;
 h = hours();
 m = min();
 s = sec();
 const options = {weekday:'long', year: 'numeric', month : 'long', day: 'numeric'};
time = h + ':' + m + ':' + s 
date = a.toLocaleDateString(undefined, options);
// date = a.toLocaleDateString();
document.getElementById('time').innerHTML = " " + time + "<br> on " + date;},
1);
    