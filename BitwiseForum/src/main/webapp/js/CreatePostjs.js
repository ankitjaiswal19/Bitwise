/*var i=0;
var myMap = new Map();
function AddMoreTag(){

    var name = document.getElementById("List");
    if (name.value.trim() != "" && name.value != null && myMap.get(name.value.trim())==null)
    {
        myMap.set(name.value.trim(),true);
        //alert(name.value.trim());
        var tab = document.getElementById("TagaData");
        var td1 = document.createElement("td");
        td1.className="td1";
        var td2 = document.createElement("td");
        td2.className="td2";
        var cb= document.createElement("input");
        cb.type="checkbox";
        cb.className="cb";
        cb.id="cb"+(i++);
        var td3 = document.createElement("td");
        var lab=document.createElement("label");
        lab.innerHTML=name.value;
        td3.appendChild(lab);
        td2.appendChild(cb);
        td1.appendChild(td2);
        td1.appendChild(td3);
        tab.appendChild(td1);
    }
    name.value="";
}
function delName()
{
    var r=document.getElementsByClassName("td1");
    var tb=document.getElementById("TagaData");
    for(var j=0;j< r.length;j++)
    {
        console.log(j);
        if(r[j].getElementsByClassName("td2")[0].getElementsByClassName("cb")[0].checked==true)
        {
        	tb.s.deleteRow(r[j]);
        	
        }
        location.reload(delName());
        //location.reload(AddMoreTag(this));
        // location.reload(delName(tb));
    }
}
*/
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
        lab.innerHTML=name.value;
        td2.appendChild(lab);
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
    for(var j=0;j< r.length;j++)
    {
        if(r[j].getElementsByClassName("td1")[0].getElementsByClassName("cb")[0].checked==true)
        {

            tb.removeChild(r[j]);
            
        }
        location.reload(delName());
       
    }

}
