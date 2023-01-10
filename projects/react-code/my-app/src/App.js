import React from "react"

  const App = () => {
    // Sample input
    const payload = {
    "columns":["col1","col2","col3","col4","col5","col6"],
    "rows":[
      [{
        "cell_id": 1,
        "value": "abc"
      }, {
        "cell_id": 2,
        "value": "abc"
      }, {
        "cell_id": 3,
        "value": "abc"
      }, {
        "cell_id": 4,
        "value": "xyz"
      }, {
        "cell_id": 5,
        "value": "xyz"
      }, {
        "cell_id": 6,
        "value": "ghf"
      }
  ]
]}

  const getColspan = (arr) => {
    const obj = {};
    for(let data of arr) {
      if (obj[data.value]) {
        obj[data.value]++;
      } else {
        obj[data.value] = 1;
      }
    }
    return obj;
  }
  
  return (
    <div>
      <table border={2}>
        {
          //map to traverse each row.
          payload.rows.map(data => {  
            const obj = getColspan(data);
            //map to traverse data in each row.
            return <tr>{Object.keys(obj).map(key => {
              return <td colSpan={obj[key]}>{key}</td>
            })}
          </tr>
        })
        }
        <tr>
          {payload.columns.map(data => <td>{data}</td>)}
        </tr>
      </table>
    </div>
  )
};

export default App;
