export function callMe(id) {
    console.log("Inside callMe!", id);
    return async dispatch => {
      setTimeout(() => {
        dispatch({type: 'UPDATE'});
      }, 5000);
    }
}