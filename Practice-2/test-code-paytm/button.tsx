
export enum ButtonType {
    primary = "primary",
    secondary = "secondary"
}

interface ButtonProps {
    color: ButtonColor;
}

function CustomButton({ type, children, ...props }: ButtonProps & React.HTMLProps<HTMLButtonElement>) {

    return (
        <button style={{ color: color }}>{children}</button>
    )
}


