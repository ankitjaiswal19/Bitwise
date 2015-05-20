var i=0;
var myMap = new Map();
function AddMoreTag(){

    var name = document.getElementById("List");
    if (name.value.trim() != "" && name.value != null && myMap.get(name.value.trim())==null)
    {
        myMap.set(name.value.trim(),true);
        //alert(name.value.trim());
        var tab = document.getElementById("nametable");
        var tr = document.createElement("tr");
        tr.className="names";
        var td1 = document.createElement("td");
        td1.className="td1";
        var cb= document.createElement("input");
        cb.type="checkbox";
        cb.className="cb";
        cb.id="cb"+(i++);
        var td2 = document.createElement("td");
        var lab=document.createElement("label");
        var input=document.createElement("input");
        input.type="Hidden";
        input.value= name.value;
        input.name= name.value;
        lab.innerHTML=name.value;
        td2.appendChild(lab);
        td2.appendChild(input);
        td1.appendChild(cb);
        tr.appendChild(td1);
        tr.appendChild(td2);
        tab.appendChild(tr);
    }
    name.value="";
}
function delName()
{
    var r=document.getElementsByClassName("names");
    var tb=document.getElementById("nametable");
    var clist=[];
    for(var j=0;j< r.length;j++)
    {
        if(r[j].getElementsByClassName("td1")[0].getElementsByClassName("cb")[0].checked==true)
        {
        	var cal= r[j].getElementsByTagName("td");
            clist.push(cal[1].innerText);
            tb.removeChild(r[j]);
           
        }
        location.reload(delName);
       
    }
    alert(clist);

}
