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
  function flattenedObj(obj) {
    const flat = {};
    Object.keys(obj).forEach(key => {
        const val = obj[key];
        if (val == 'object' && val != null && !Array.isArray(val)) {
            flat = {...flat, ...flattenedObj(val)};
        } else {
            flat[key] = obj[key];
        }
    });
    return flat;
  }
  console.log(flattenedObj(testObject));