import React, { ReactElement, useEffect, useState } from 'react';
import { useFormik } from 'formik';
import * as yup from 'yup';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import { createServer } from "miragejs"

createServer({
    routes() {
      let customerDetails = {
        name: 'Vikash Mishra',
        dob: '2017-05-24',
        email: 'foobar@example.com',
        address: '',
        phone: '',
        altPhone: ''
      };
      this.get("/api/customerDetails/1", () => {
        return customerDetails;
      })

      this.post("/api/customerDetails/1", (schema, request) => {
        let attrs = JSON.parse(request.requestBody);
        customerDetails  = { ...customerDetails, ...attrs };
        return customerDetails;
      })
    },
});
const phoneRegExp = /^((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?$/

const validationSchema = yup.object({
  name: yup.string()
    .required('Customer Name Required')
    .max(50),
  email: yup
    .string()
    .email('Enter a valid email')
    .required('Email is Required'),
  address: yup.string()
    .required('Address is Required')
    .max(600),
  dob: yup.date()
    .required('DOB is Required'),
  phone: yup
    .string()
    .required('Phone number Required')
    .matches(phoneRegExp, 'Phone number is not valid')
});
interface Props {
  isFormEditable : boolean;
}
export default function WithMaterialUI({isFormEditable}: Props): ReactElement {
  const [isSubmitted, setSubmitted] = useState(false);

  const customerDetails = {
    name: 'Vikash Mishra',
    dob: '2017-05-24',
    email: 'foobar@example.com',
    address: '',
    phone: '',
    altPhone: ''
  };

  const formik = useFormik({
    initialValues: customerDetails,
    validationSchema: validationSchema,
    onSubmit: (values, actions) => {
      alert(JSON.stringify(values, null, 2));
      fetch("/api/customerDetails/1", {
        method : 'POST',
        body: JSON.stringify(values)
      })
      .then((response) => response.json())
      .then((json) => {formik.setValues({...json})})
      actions.setSubmitting(false);
      setSubmitted(!isSubmitted);
    },
  });
  useEffect(() => {
    fetch("/api/customerDetails/1")
      .then((response) => response.json())
      .then((json) => {formik.setValues({...json})})
  }, [])
  
  return (
      <Box
        component="form"
        sx={{
          '& .MuiTextField-root': { m: 1, width: '25ch' },
          padding: '20px'
        }}
        noValidate
        autoComplete="off"
        onSubmit={(e) => {e.preventDefault(); formik.handleSubmit(e)}}
      >
      <Grid container rowSpacing={1} columnSpacing={{ xs: 1, sm: 2, md: 3 }}>
        <Grid item xs={4}>
        <TextField
            fullWidth
            id="name"
            name="name"
            label="Customer Name"
            value={formik.values.name}
            onChange={formik.handleChange}
            error={formik.touched.name && Boolean(formik.errors.name)}
            helperText={formik.touched.name && formik.errors.name}
            disabled={!isFormEditable}
          />
          <TextField
            fullWidth
            id="dob"
            name="dob"
            type="date"
            label="Date Of Birth"
            value={formik.values.dob}
            onChange={formik.handleChange}
            error={formik.touched.dob && Boolean(formik.errors.dob)}
            helperText={formik.touched.dob && formik.errors.dob}
            disabled={!isFormEditable}
          />
          <TextField
            fullWidth
            id="email"
            name="email"
            label="Email Address"
            value={formik.values.email}
            onChange={formik.handleChange}
            error={formik.touched.email && Boolean(formik.errors.email)}
            helperText={formik.touched.email && formik.errors.email}
            disabled={!isFormEditable}
          />
        </Grid>
        <Grid item xs={4}>
          <TextField
            fullWidth
            id="address"
            name="address"
            label="Address"
            maxRows={6}
            minRows={4}
            multiline={true}
            value={formik.values.address}
            onChange={formik.handleChange}
            error={formik.touched.address && Boolean(formik.errors.address)}
            helperText={formik.touched.address && formik.errors.address}
            disabled={!isFormEditable}
          />
        </Grid>
        <Grid item xs={4}>
          <TextField
            fullWidth
            id="phone"
            name="phone"
            label="Telephone Number"
            value={formik.values.phone}
            onChange={formik.handleChange}
            error={formik.touched.phone && Boolean(formik.errors.phone)}
            helperText={formik.touched.phone && formik.errors.phone}
            disabled={!isFormEditable}
          />
          <TextField
            fullWidth
            id="altPhone"
            name="altPhone"
            label="Alt Telephone Number"
            value={formik.values.altPhone}
            onChange={formik.handleChange}
            error={formik.touched.altPhone && Boolean(formik.errors.altPhone)}
            helperText={formik.touched.altPhone && formik.errors.altPhone}
            disabled={!isFormEditable}
          />
        </Grid>
      </Grid>
      <Button color="primary" variant="contained" fullWidth type="submit" disabled={!isFormEditable}>
        Submit
      </Button>
    </Box>
  );
};