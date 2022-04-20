import { useEffect, useState } from "react";

function getColor(color) {
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

export function Button(props) {
    console.log(props);
    // const [color, setColor] = useState("#000000")


    return (
        <button style={{ backgroundColor: getColor(props.color) }}>{props.children}</button>
    )
}