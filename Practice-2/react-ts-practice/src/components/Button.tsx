import React, { useEffect, useState } from "react";
import './Button.css';
// interface Color {

// }

export enum ButtonType {
    primary = "primary",
    secondary = "secondary"
}



interface ButtonProps {
    children: React.ReactNode;
    type: ButtonType;
}

function getColor(color: ButtonType): string {
    // useEffect(() => {
    switch (color) {
        case "primary":
            return ("#000000");
        // break;
        case "secondary":
            return ("#ffff0f");
        // break;
        default:
            // break;
            return "#000000"
    }
    // }, [])

}

function getTextColor(color: ButtonType): string {
    switch (color) {
        case ButtonType.primary:
            return "white";
        case ButtonType.secondary:
            return "red";
        default:
            return "white";

    }
}

export const Button = React.memo(({ type, children, onClick, ...props }: ButtonProps & React.HTMLProps<HTMLButtonElement>) => {
    console.log(props);
    // const [color, setColor] = useState("#000000")


    return (
        // <button className={props.type} /* style={{ backgroundColor: getColor(props.type), color: getTextColor(props.type) }} */>{props.children}</button>
        <button style={{ backgroundColor: getColor(type), color: getTextColor(type) }} onClick={onClick} >{children}</button>
    )
})