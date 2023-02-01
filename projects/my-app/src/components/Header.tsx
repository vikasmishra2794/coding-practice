import React, { ReactElement } from 'react';
import Button from '@mui/material/Button';

interface Props {
    changeFormState: () => void;
}

export default function Header({changeFormState}: Props): ReactElement {
    return (
        <div className='header'>
            <div>
                <span>Customer Details</span>
            </div>
            <Button variant="outlined" onClick={changeFormState}>Edit</Button>
        </div>
    )
}