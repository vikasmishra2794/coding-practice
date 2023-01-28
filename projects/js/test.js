const testObject = {
    a: 1,
    b: {
      c: 2,
      d: {
        e: {
          f: []
        }
      }
    }
  }
  // Print path of an attribute inside of a nested object.
  function printPath(obj, search) {
    let flat = "";
    let val;
    for(let key in obj) {
      const value = obj[key];
      if(typeof value == 'object' && value != null && !Array.isArray(value)) {
        flat = flat + key + printPath(value, search);
      } else if (key == search) {
        return key;
      }
    }
    return flat;
  }
  function flattenedObj(obj) {
    let flat = {};
    for(let key in obj) {
      const value = obj[key];
      if(typeof value == 'object' && value != null && !Array.isArray(value)) {
        flat = {...flat, ...flattenedObj(value)};
      } else {
        // console.log("printPath(obj, key):===", printPath(testObject, key));
        flat[''+printPath(testObject, key)] = value;
        console.log("flat:====",flat);
      }
    }
    return flat;
  }
  console.log(flattenedObj(testObject, 'f'));

